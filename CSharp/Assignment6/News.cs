using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment6
{
    class News : INews
    {
        private int id;
        private String title;
        private String publishDate;
        private String author;
        private String content;
        private float averageRate;

        public int Id
        {
            get
            {
                return id;
            }
            set
            {
                this.id = value;
            }
        }

        public String Title
        {
            get
            {
                return title;
            }
            set
            {
                this.title = value;
            }
        }

        public String PublishDate { get; set; }

        public String Author { get; set; }
            
        public String Content { get; set; }

        public void Display()
        {
            Console.WriteLine(this.Title);
            Console.WriteLine(this.PublishDate);
            Console.WriteLine(this.Author);
            Console.WriteLine(this.Content);
            Console.WriteLine(this.averageRate);
        }

        int[] RateList = new int[3];

        public void Calculate()
        {
            int total = 0;
            for (int i = 0; i < RateList.Length; i++)
            {
                total += RateList[i];
            }
            this.averageRate = total / RateList.Length;
        }
    }
}
