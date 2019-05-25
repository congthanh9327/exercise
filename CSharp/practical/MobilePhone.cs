namespace Practical
{
    public class MobilePhone : Product
    {
        public MobilePhone(int id, string name, int price, string producer) : base(id, name, price, producer)
        {
        }

        public override double computeTax()
        {
            return (double) price * 10 / 100;
        }
    }
}