package com.gb.gofpatterns.structural.proxy;

public class ProxyFileLoaderMain {
    public static void main(String[] args) {
        ProxyFileServiceImpl proxyFileService = new ProxyFileServiceImpl();
        File file1 = proxyFileService.getFile("file1.txt");
        File file2 = proxyFileService.getFile("file2.txt");

        System.out.println("Contents of file 1");
        System.out.println(file1.getContent());
        System.out.println("Contents of file 2");
        System.out.println(file2.getContent());
        System.out.println("Contents of file 1");
        File file3 = proxyFileService.getFile("file1.txt");
        System.out.println(file3.getContent());
    }
}
