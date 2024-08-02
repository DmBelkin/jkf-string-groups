package ru.sendel;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class SingleString {


    public String stringsGrouping(String path) throws IOException {
        File file = new File(path);
        System.out.println(path);
        List<String> inputList = Files.readAllLines(Paths.get(file.getPath()));
        Set<String> validate = new HashSet<>();
        List<Item> items = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (String s : inputList) {
            if (validate.contains(s) || s.isBlank()) {
                continue;
            }
            validate.add(s);
            Item item = new Item();
            String[] data = s.split(";");
            min = Integer.min(min, data.length);
            List<String> l = Arrays.stream(data).collect(Collectors.toList());
            item.setInputString(s);
            item.setDec(l);
            items.add(item);
        }
        if (items.size() == 1) {
            Group group = new Group(1, items);
            return print(new ArrayList<>() {{
                add(group);
            }});
        }
        int i = 0;
        List<Group> groups = new ArrayList<>();
        while (i++ < min) {
            Map<String, Group> sub = new HashMap<>();
            for (Item item : items) {
                Group group = sub.get(item.getDec().get(item.getIndex()));
                int index = item.getIndex();
                String key = item.getDec().get(index);
                item.setIndex(item.getIndex() + 1);
                if (!StringValidator.isValid(key)) {
                    continue;
                }
                if (group == null) {
                    Group group1 = new Group(0, new ArrayList<>() {{
                        add(item);
                    }});
                    if (item.getGroup() != null) {
                        group1 = item.getGroup();
                    }
                    sub.put(key, group1);
                } else {
                    group.setItem(item);
                    item.setGroup(group);
                    sub.put(key, group);
                }
            }
            for (Map.Entry<String, Group> m : sub.entrySet()) {
                if (m.getValue().getItems().size() > 1 && !groups.contains(m.getValue())) {
                    groups.add(m.getValue());
                }
            }
        }
        return print(groups);
    }

    public String print(List<Group> groups) throws IOException {
        Comparator<Group> comparator = Comparator.comparing(o -> o.getItems().size());
        Collections.sort(groups, comparator);
        Collections.reverse(groups);
        StringBuilder builder = new StringBuilder();
        if (groups.isEmpty()) {
            return "\n";
        }
        int number = 1;
        for (Group group : groups) {
            group.setNumber(number++);
            builder.append(group + "\n");
        }
        PrintWriter writer = new PrintWriter("C:\\jkf-string-groups\\output\\dst.txt");
        writer.write(builder.toString());
        writer.flush();
        writer.close();
        return builder.toString().trim();
    }


}
