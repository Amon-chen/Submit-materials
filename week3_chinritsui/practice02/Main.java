package week3_chinritsui.practice02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String fileName = "nikujaga.txt";

        // =========================
        // ① 文件创建（try-catch）
        // =========================
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // =========================
        // ② 写入文件（try-with-resources）
        // =========================
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

            bw.write("carrot");
            bw.newLine();
            bw.write("potato");
            bw.newLine();
            bw.write("meat");
            bw.newLine();
            bw.write("onion");

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // =========================
        // ③ 读取文件（try-with-resources）
        // =========================
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}