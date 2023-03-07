package com.KoreaIT.example.JAM;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("==프로그램 시작 == ");

		int articleID = 0;

		ArrayList<Article> articles = new ArrayList<>();

		while (true) {
			System.out.printf("명령어 )");
			String cmd = sc.nextLine().trim();

			if (cmd.equals("exit")) {
				System.out.println("==프로그램 종류 ==");
				break;
			} else if (cmd.equals("article write")) {
				System.out.println("==게시글 작성==");

				int id = articleID + 1;
				articleID = id;

				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();

				Article article = new Article(id, title, body);
				articles.add(article);

				System.out.printf("%d번글이 생성되었습니다.\n", id);

			} else if (cmd.equals("article list")) {
				System.out.println("==게시글 목록==");

				if (articles.size() == 0) {
					System.out.println("게시글이 없습니다.");
					continue;
				}

				System.out.println("번호   |    제목");

				for (Article article : articles) {
					System.out.printf("%d    |   %s\n", article.id, article.title);
				}

			} else {
				System.out.println("존재하지 않는 명령어입니다.");
				continue;
			}

		}

		sc.close();

	}
}
