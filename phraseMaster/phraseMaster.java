//专家术语学习机
import java.lang.Math;
import java.lang.String;
import java.lang.System;

public class phraseMaster {
    public static void main (String[] args) {
        //三个字符串,存储一些术语
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B",
                "win-win", "front-end", "web-based", "prevasive", "smart",
                "six-sigma", "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented",
                "cntric", "distributed", "clustered", "branded", "outside-the-box",
                "positioned", "networked", "focused", "leveraged", "aligned",
                "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution",
                "architecture", "core competency", "strategy", "mindshare",
                "portal", "space", "vision", "paradigm", "mission"};

        //获取三个字符串的长度,用于使后面获取的随机数不超过字符串长度
        int lengthOne = wordListOne.length;
        int lengthTwo = wordListTwo.length;
        int lengthThree = wordListThree.length;

        //获取随机数,从而随机从三个字符串中间取一个子串组成一个句子
        int randOne = (int) (Math.random() * lengthOne);
        int randTwo = (int) (Math.random() * lengthTwo);
        int randThree = (int) (Math.random() * lengthThree);

        //利用随机数取出三个字符串中的一部分组成一个新的句子并输出
        String graph = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree] + ".";
        System.out.println("What we need is a " + graph);

    }
}