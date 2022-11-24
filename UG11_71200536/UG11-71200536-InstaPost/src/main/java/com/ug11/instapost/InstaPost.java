package com.ug11.instapost;


public class InstaPost {
    private int totalMention;
    private String email;
    private String username;

    public InstaPost() {}

    public void printInfo() {
        System.out.println("Username: "+username);
        System.out.println("Email: "+email);
        System.out.println("Total Mention: "+totalMention);
    }

    public void login(String email) throws EmailException {
        try {
            if (!email.contains("@")) {
                throw new EmailException(1);
            }
            if (!email.contains("@gmail")) {
                throw new EmailException(2);
            }
            String[] split = email.split("@");
            email = email;

            username = split[0].toUpperCase();
            System.out.println("Login berhasil");
        } catch (EmailException e) {
            System.out.println("Error: Login gagal! "+e.getErrorMessage());
        }
    }

    public void post(String caption) {
        StringBuilder mention = new StringBuilder();
        int count = 0;
        if (caption.contains("@")) {
            String[] split = caption.split(" ");
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains("@")) {
                    if (mention.length() == 0) {
                        mention.append(split[i]);
                    } else {
                        mention.append(", " + split[i]);
                    }
                    count += 1;
                }
            }
        }
        totalMention += count;
        System.out.println("Caption: " + caption);
        if (totalMention > 0) {
            System.out.println("Pengguna yang Anda mention: " + mention);
        } else {
            System.out.println("Pengguna yang Anda mention: -");
        }
        System.out.println("Total usename yang Anda mention: " + count);
    }

}
