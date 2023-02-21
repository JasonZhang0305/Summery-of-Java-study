package com.zzj.regxp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTheory {
    public static void main(String[] args) {
        String content = "1995年，互联网的蓬勃发展给了Oak机会。1999业界为了使死板、单调的静态网页能够“灵活”起来，" +
                "急需一种软件技术来开发一种程序，这种程序可以通过网络传播并且能够跨平台运行。于是，世界各大IT企业" +
                "为此纷纷投入了大量的人力、物力和财力。这个时候，2000Sun公司想起了那个被搁置起来很久的Oak，并且重新审" +
                "视了那个用软件编写的试验平台，由于它是按照嵌入式系统硬件平台体系结构进行编写的，所以非常小，特别适" +
                "用于网络上的传输系统，而Oak也是一种精简的语言，程序非常小，适合在网络上传输。Sun公司首先推出了可以" +
                "嵌入网页并且可以随同网页在网络上传输的Applet（Applet是一种将小程序嵌入到网页中进行执行的技术），并" +
                "将Oak更名为Java。5月23日，Sun公司在Sun world会议上正式发布Java和HotJava浏览器。IBM、Apple、" +
                "DEC、Adobe、HP、Oracle、Netscape和微软等各大公司都纷纷停止了自己的相关开发项目，竞相购买了Java使" +
                "用许可证，并为自己的产品开发了相应的Java平台。";
//        目标，匹配所有的四个数字
//        正则表达式中，有小括号就表示分组，第一个（）表示组1

        String regStr = "(\\d\\d)(\\d\\d)";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        /*
        * matcher.find()
         */
        while (matcher.find()) {
            System.out.println(matcher.group(0)); //0就是所有，1是第一组，...
        }
    }
}
