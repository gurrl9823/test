package com.company;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.run(); // run!!!!

        String s = "  1  ";
        s.trim(); // 그냥 사용한다고 s에 적용되는게 아님
        System.out.println("\"" + s + "\""); // "  1  " 그대로 출력

        System.out.println("   ".length()); // 3

        s = "   ";
        s = s.trim(); // ""
        System.out.println("\"" + s + "\"");

//        int num = Integer.parseInt("10a11111111111111111111111111111111111"); // NumberFormatException
//        int num = Integer.parseInt("1  1"); // NumberFormatException
//        System.out.println(num);

        int[] numArray = {1, 2, 3};
        List<Integer> numList = List.of(1, 2, 3);

        System.out.println(numArray[0]);
        System.out.println(numArray.getClass().getName());
        System.out.println(numList.get(0));
        System.out.println(numList.getClass().getName());


        String a = "";
        System.out.println("a length : " + a.length());

        System.out.println("\n");


        String test = null;
//        switch (test) { // NullPointerException
//            case "0":
//                System.out.println("0");
//                break;
//            case "1":
//                System.out.println("1");
//                break;
//        }
//        System.out.println(List.of(test)); // NullPointerException




        String aaa = "정제수, 나이아신아마이드, 글리세린, 베헤닐알코올, 펜틸렌글라이콜, 스테아릴 알코올, 세틸알코올, 글리세릴스테아레이트, 부틸렌글라이콜, 실리카, 하이드록시아세토페논, 폴리아크릴레이트-13, 암모늄아크릴로일다이메틸타우레이트/브이피코폴리머, 아라키딜알코올, 폴리아이소부텐, 잔탄검, 마텔추출물, 우스니아추출물, 초피나무열매추출물, 판테놀, 한련추출물, 할미꽃추출물, 알란토인, 알로에베라잎가루, 에틸헥실글리세린, 다이포타슘글리시리제이트, 폴리솔베이트20, 솔비탄이소스테아레이트, 다이소듐이디티에이, 다이메틸설폰, 피리독신에이치씨엘, 흰버드나무껍질추출물, 말토덱스트린, 미리스틸알코올, 1.2-헥산다이올, 영지버섯추출물, 카퍼트라이펩타이드-1, 서양산딸기잎추출물, 프로판다이올, 베타-글루칸, 올리고펩타이드-14, 헥사펩타이드-61다이머, 카프릴릴글라이콜, 마데카소사이드, 글라이신, 알라닌, 글라타믹애씨드,세린, 아시아티코사이드, 알지닌, 병풀잎추출물, 레반, 얼룩파인애플추출물, 파파야열매추출물";
        String bbb = "정제수,글리세린,베헤닐알코올, 펜틸렌글라이콜, 세테아릴알코올,나이아신아마이드,글리세릴스테아레이트,폴리아크릴레이트-13, 폴리아이소부텐, 폴리솔베이트20, 파파야열매추출물, 얼룩파인애플추출물,말토덱스트린, 서양산딸기잎추출물, 다이메틸설폰, 흰버드나무껍질추출물, 베타-글루칸(효모),실리카,카퍼트라이펩타이드-1, 올리고펩타이드-14, 알로에베라잎가루, 레반,알란토인,마데카소사이드,아시아티코사이드,판테놀,피리독신에이치씨엘, 다이포타슘글리시리제이트,잔탄검, 암모늄아크릴로일다이메틸타우레이트/브이피코폴리머,알라닌,알지닌, 글라이신,글루타믹애씨드,세린,부틸렌글라이콜, 하이드록시아세토페논, 마텔추출물, 한련추출물,초피나무열매추출물,할미꽃추출물,우스니아추출물, 트로메타민,다이소듐이디티에이,1.2-헥산다이올,에틸헥실글리세린";

        String[] ingredients1 = aaa.split(",");
        String[] ingredients2 = bbb.split(",");

        Stream<String> ingredientStream1 = Arrays.stream(ingredients1)
            .map(String::trim)
            .sorted();

        Stream<String> ingredientStream2 = Arrays.stream(ingredients2)
            .map(String::trim)
            .sorted();

        ingredientStream1.forEach(System.out::println);
        System.out.println("\n");
        ingredientStream2.forEach(System.out::println);
        System.out.println("\n");

        // ----------------

        String input = "VIP무료영화|0|3|2|20230614||20170|0|||I||N|||VIP|http://mimstb-c.uplus.co.kr:88/image/|VIP.png|N|CAT|A5002||\fHD라이트|9000|4|1|20230614||12000|0|||I||||||http://mimstb-c.uplus.co.kr:88/image/||N|CHN|168||\f";
        String[] tokens = input.split("\\|");

        StringBuilder output = new StringBuilder();

        for (String token : tokens) {
            if (token.isEmpty()) {
                output.append("|\n");
            } else {
                output.append(token).append("|\n");
            }
        }

        System.out.println(output.toString());

        System.out.println("\n");

        String result = "VIP무료영화|0|3|2|20230614||20170|0|||I||N|||VIP|http://mimstb-c.uplus.co.kr:88/image/|VIP.png|N|CAT|A5002||\fHD라이트|9000|4|1|20230614||12000|0|||I||||||http://mimstb-c.uplus.co.kr:88/image/||N|CHN|168||\f";
        ArrayList arrayList = new ArrayList<>(Arrays.asList(result.split("\f")));

        arrayList.forEach(System.out::println);

        System.out.println("1 push");

        System.out.println("2 push");


    }
}


class Car {
    Engine engine;

    Car(Engine e) {
        this.engine = e;
    }

    void run() {
        engine.run();
    }
}

class Engine {
    void run(){
        System.out.println("run!!!!");
    }
}


