using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment5
{
     public abstract class Phone
    {
       public abstract void insertPhone(String name, String phone);
        public abstract void removePhone(String name);
        public abstract void updatePhone(String name, String newphone);
        public abstract void searchPhone(String name);
    }
}
