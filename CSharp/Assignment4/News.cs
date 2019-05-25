using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment4
{
    class News : INews
    {
        private int id;
        private string title;
        private string publishDate;
        private string author;
        private string content;
        private float averageRate;

        public int Id { get; set; }
        public string Title { get; set; }
        public string PublishDate { get; set; }
        public string Author { get; set; }
        public string Content { get; set; }
        public float AverageRate { get; }

        public void Display()
        {
            Console.WriteLine("Id: " + this.id);
            Console.WriteLine("Title: " + this.title);
            Console.WriteLine("PublishDate: " + this.publishDate);
            Console.WriteLine("Author: " + this.author);
            Console.WriteLine("Content: " + this.content);
            Console.WriteLine("AverageRate: " + this.averageRate);
            Console.WriteLine();
        }

        int [] RateList = new int [3];

        public void Calculate()
        {
            int total = 0;
            for (int i = 0; i < RateList.Length; i++)
            {
                total += RateList[i];
            }
            this.averageRate = total / 3;
        }

        public News()
        {
        }

        public News(string title, string publishDate, string author, string content, int[] rateList)
        {
            this.title = title;
            this.publishDate = publishDate;
            this.author = author;
            this.content = content;
            RateList = rateList;
        }
    }
}

