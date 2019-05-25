using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment7
{
    
    class Program
    {
        
        public static void showStringProgram(string x)
        {
            Console.WriteLine(x);
        }
        static void Main(string[] args)
        {
            Programs program = new Programs();
            program.Click += showStringProgram;
            program.Price = 20;
            program.Price = 22;
            Console.ReadKey();
        }
        
    }
}
