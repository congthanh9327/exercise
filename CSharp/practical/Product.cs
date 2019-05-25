namespace Practical
{
    public abstract class Product
    {
         public int id;
         public string name;
         public int price;
         public string producer;

        public Product(int id, string name, int price, string producer)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.producer = producer;
        }

        public abstract double computeTax();
    }
}