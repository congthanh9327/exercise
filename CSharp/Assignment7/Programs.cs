using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment7
{
    class Programs
    {
        public delegate void showString(string s);
        public event showString Click;
        private String name;
        private int price;

        public String Name
        {
            get
            {
                return name;
            }
            set
            {
                this.name = value;
            }
        }

        public int Price
        {
            get
            {
                return price;
            }
            set
            {
                if (this.price!=0 && this.price != value)
                {
                    if (Click != null)
                    {
                        Click("Price was changed");
                    }
                }
                this.price = value;
            }
        }
    }
}
