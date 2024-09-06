package ru.sendel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class StringPerformanceTest {

    private SingleString string = new SingleString();

    @Test
    @DisplayName("testFiveLineOneGroup")
    void validate() throws IOException {
        assertEquals("Группа 1\n" + "\"79282658856\";\"79815354258\";\"79723702292\";\"79815334258\";\"79667357621\";\"79547897526\";\"79569882751\"\n" +
                        "\"79899216253\";\"79815354258\";\"79823519313\";\"79187368421\";\"79967298407\";\"79495156330\";\"79806628428\";\"79751719169\"\n" +
                        "\"79846271511\";\"79815354258\";\"\";\"79385535785\";\"79975516840\";\"79409433153\";\"79340443814\";\"79579748263\"\n" +
                        "\"79854601252\";\"79815354258\";\"79721864984\";\"79935764936\";\"79402591822\"\n" +
                        "\"79336414263\";\"79148780919\";\"79721864984\";\"\";\"79177040848\";\"79700135340\"",
                string.stringsGrouping("C:\\jkf-string-groups\\input\\testFiveLineOneGroupSrc.txt"));
    }

    @Test
    @DisplayName("testFiveLineTwoGroup")
    void test1() throws IOException {
        assertEquals("Группа 1\n" +
                        "\"79282658856\";\"79815354258\";\"79723702292\";\"79815334258\";\"79667357621\";\"79547897526\";\"79569882751\"\n" +
                        "\"79899216253\";\"79815354258\";\"79823519313\";\"79187368421\";\"79967298407\";\"79495156330\";\"79806628428\";\"79751719169\"\n" +
                        "\"79846271511\";\"79815354258\";\"\";\"79385535785\";\"79975516840\";\"79409433153\";\"79340443814\";\"79579748263\"\n" +
                        "Группа 2\n" +
                        "\"79854601252\";\"79678459504\";\"79721864984\";\"79935764936\";\"79402591822\"\n" +
                        "\"79336414263\";\"79148780919\";\"79721864984\";\"\";\"79177040848\";\"79700135340\"",
                string.stringsGrouping("C:\\jkf-string-groups\\input\\testFiveLineTwoGroupSrc.txt"));

    }

    @Test
    @DisplayName("testThreeLineDuplicate")
    void test2() throws IOException{
        assertEquals("Группа 1\n" +
                        "\"79282658856\";\"79815354258\";\"79723702292\";\"79815334258\";\"79667357621\";\"79547897526\";\"79569882751\"\n" +
                        "\"79899216253\";\"79815354258\";\"79823519313\";\"79187368421\";\"79967298407\";\"79495156330\";\"79806628428\";\"79751719169\"\n" +
                        "\"79846271511\";\"79815354258\";\"\";\"79385535785\";\"79975516840\";\"79409433153\";\"79340443814\";\"79579748263\"",
                string.stringsGrouping("C:\\jkf-string-groups\\input\\testThreeLineDuplicateSrc.txt"));

    }

    @Test
    @DisplayName("testThreeLineHalfMatch")
    void test3() throws IOException {
        assertEquals("Группа 1\n" +
                        "\"79282658856\";\"79815354258\";\"79723702292\";\"79815334258\";\"79667357621\";\"79547897526\";\"79569882751\"\n" +
                        "\"79899216253\";\"79815354258\";\"79823519313\";\"79187368421\";\"79967298407\";\"79495156330\";\"79806628428\";\"79751719169\"",
                string.stringsGrouping("C:\\jkf-string-groups\\input\\testThreeLineHalfMatchSrc.txt"));
    }

    @Test
    @DisplayName("testThreeLineMatch")
    void test4() throws IOException{
        assertEquals("Группа 1\n" +
                        "\"79282658856\";\"79815354258\";\"79723702292\";\"79815334258\";\"79667357621\";\"79547897526\";\"79569882751\"\n" +
                        "\"79899216253\";\"79815354258\";\"79823519313\";\"79187368421\";\"79967298407\";\"79495156330\";\"79806628428\";\"79751719169\"\n" +
                        "\"79846271511\";\"79815354258\";\"\";\"79385535785\";\"79975516840\";\"79409433153\";\"79340443814\";\"79579748263\"",
                string.stringsGrouping("C:\\jkf-string-groups\\input\\testThreeLineMatchSrc.txt"));
    }

    @Test
    @DisplayName("testThreeLineNonMatch")
    void test5() throws IOException {
        assertEquals("\n", string.stringsGrouping("C:\\jkf-string-groups\\input\\testThreeLineNonMatchSrc.txt"));

    }

    @Test
    @DisplayName("testThreeLineNonMatch")
    void test6() throws IOException{
        assertEquals("\n", string.stringsGrouping("C:\\jkf-string-groups\\input\\testThreeLineNonMatchSrc.txt"));
    }

    @Test
    @DisplayName("testTwoLineDuplicate")
    void test7() throws IOException {
        assertEquals("Группа 1\n" +
                        "\"79846271511\";\"79815354258\";\"\";\"79385535785\";\"79975516840\";\"79409433153\";\"79340443814\";\"79579748263\"",
                string.stringsGrouping("C:\\jkf-string-groups\\input\\testTwoLineDuplicateSrc.txt"));
    }
}
