namespace Practical
{
    public class Book : Product
    {
        public Book(int id, string name, int price, string producer) : base(id, name, price, producer)
        {
        }

        public override double computeTax()
        {
            return (double) price * 8 / 100 ;
        }
    }
}