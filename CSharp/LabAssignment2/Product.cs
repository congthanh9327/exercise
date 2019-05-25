using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LabAssignment2
{
    class Product
    {
        public int id;
        public string name;
        public int price;
        public int qty;
        public string image;
        public string desc;
        List <string> gallery;

        public Product()
        {

        }

        public Product(int id, string name, int price, int qty, string image, string desc, List<string> gallery)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.qty = qty;
            this.image = image;
            this.desc = desc;
            this.gallery = gallery;
        }

        public void getInfo()
        {
            Console.WriteLine(this.id);
            Console.WriteLine(this.name);
            Console.WriteLine(this.price);
            Console.WriteLine(this.qty);
            Console.WriteLine(this.image);
            Console.WriteLine(this.desc);
            foreach(string stringGallery in gallery)
            {
                Console.WriteLine(stringGallery);
            }
        }

        public void inventoryNotice(int qty)
        {
            if(qty==0)
            {
                Console.WriteLine("Out of stock");
            }
            else
            {
                Console.WriteLine("In stock");
            }
        }

        public void insertImageIntoGallery()
        {
            if (gallery.Count() >= 10)
            {
                Console.WriteLine("Please delete before insert");
            }
            else
            {
                Console.WriteLine("Image Inserted: ");
                string imageInserted = Console.ReadLine();
                gallery.Add(imageInserted);
            }
        }

        public void deleteImageFromGallery()
        {
            foreach(string stringGallery in gallery)
            {
                Console.WriteLine(stringGallery);
            }
            Console.WriteLine("Choose an image to delete: ");
            int choice = Convert.ToInt32(Console.ReadLine());
            gallery.RemoveAt(choice);
            Console.WriteLine("Delete successful");
        }
    }
}
