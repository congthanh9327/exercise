using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment4
{
    class Program
    {
        static void Main(string[] args)
        {
            List<News> listNews = new List<News>();
            int flag = 0;
            do
            {
                Console.WriteLine("1. Insert news");
                Console.WriteLine("2. View list news");
                Console.WriteLine("3. Average rate");
                Console.WriteLine("4. Exit");
                Console.WriteLine("Please choose an option");
                int choice = Convert.ToInt32(Console.ReadLine());
                switch (choice)
                {
                    case 1:
                        Console.WriteLine("Title: ");
                        string title = Console.ReadLine();
                        Console.WriteLine("Publish date: ");
                        string publishDate = Console.ReadLine();
                        Console.WriteLine("Author: ");
                        string author = Console.ReadLine();
                        Console.WriteLine("Content: ");
                        string content = Console.ReadLine();
                        Console.WriteLine("Rate List: ");
                        int[] rateList = new int[3];
                        for (int i = 0; i < 3; i++)
                        {
                            Console.WriteLine("value no "+(i+1));
                            rateList[i] = Convert.ToInt32(Console.ReadLine());
                        }
                        News news = new News(title, publishDate, author, content, rateList);
                        listNews.Add(news);
                        break;
                    case 2:
                        foreach (News newsItem in listNews)
                        {
                            newsItem.Display();
                        }
                        break;
                    case 3:
                        foreach (var newsItem in listNews)
                        {
                            newsItem.Calculate();
                            newsItem.Display();
                        }
                        break;
                    case 4:
                        flag = 1;
                        break;
                }
            }
            while (flag == 0);
            Console.ReadKey();
        }

        
    }
}
