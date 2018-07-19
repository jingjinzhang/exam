package com.hand;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;

public class App {
    public static void main(String[] args) {

        File file = new File("test1/text.txt");
        File file2 = new File("test1/test2.txt");
        //读


        try {
            FileInputStream fis =  new FileInputStream(file);
            InputStreamReader isr =  new InputStreamReader(fis,"UTF-8");
            BufferedReader br = new BufferedReader(isr);

            FileOutputStream fos = new FileOutputStream(file2);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
            //BufferedWriter bw = new BufferedWriter(osw);
            //打印流
            PrintWriter pw = new PrintWriter(osw);

            String line;
            while((line = br.readLine()) != null){
                pw.println(line);
            }
            System.out.println("done");
            pw.flush();
            pw.close();
            osw.close();
            fos.close();
            br.close();
            isr.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void printFile(File dir,int tab){
//        if(dir.isDirectory()){
//            File[] files = dir.listFiles();
//            for(int i = 0; i<files.length; i++){
//                for(int j = 0; j < tab; j++){
//                    System.out.print("|-");
//                }
//                System.out.println(files[i].getName());
//                if(files[i].isDirectory()){
//                    printFile(files[i],++tab);
//                }
//            }
//        }
//    }
//        Random random = new Random();
//        random.ints(1,10).limit(10).filter(i -> i>=5).sorted().forEach(System.out::println);
//
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        List<Integer> newList = list.parallelStream().map(i -> i*2).collect(Collectors.toList());
//        newList.forEach(System.out::println);
//        IntSummaryStatistics statistics = list.stream().mapToInt((x)->x).summaryStatistics();
//        System.out.println(statistics.getMax()+"  "+statistics.getMin()+"  "+statistics.getAverage()+"  "+statistics.getSum()+"  "+statistics.getCount());



//        App app = new App();
//
//        MathOperation addition = (int a, int b)-> a + b;
//        System.out.println(app.operate(1,2,addition));
//        List a = Vector();
//        Comparator<String> comparator = (x,y) -> Integer.compare(x.length(),y.length());
//        int res = comparator.comparator("2222","33333");
//    }
//    interface Comparator<T>{
//        int comparator(T x,T y);
//    }
//    interface MathOperation{
//        int operation(int a, int b);
//    }
//    private int operate(int a, int b, MathOperation mathOperation){
//        return mathOperation.operation(a, b);
//    }
}


