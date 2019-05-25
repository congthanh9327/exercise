using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment5
{
    class PhoneNumber
    {
        String name;
        String phone;

        public PhoneNumber(string name, string phone)
        {
            this.name = name;
            this.phone = phone;
        }

        public PhoneNumber()
        {
        }

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

        public String Phone
        {
            get
            {
                return phone;
            }
            set
            {
                this.phone = value;
            }
        }
    }
}
