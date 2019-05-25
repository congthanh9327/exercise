using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment5
{
    public class PhoneBook : Phone
    {
        
        
        List<PhoneNumber> phoneList = new List<PhoneNumber>();
        
        internal List<PhoneNumber> PhoneList 
        {
            get
            {
                return phoneList;
            }
            
        }

   
        internal void AddPhoneList(PhoneNumber phoneNumber)
        {
            phoneList.Add(phoneNumber);
        }

        public override void insertPhone(string name, string phone)
        {
            int count = 0;

            for (int i = 0; i < phoneList.Count; i++)
            {
                if (name == phoneList[i].Name)
                {
                    phoneList[i].Phone = phoneList[i].Phone + ":" + phone;
                    count++;
                    break;
                }

            }
            if(count==0)
            {
                PhoneNumber newPhone = new PhoneNumber(name, phone);
                phoneList.Add(newPhone);
            }
            
        }

        public override void removePhone(string name)
        {
            int count = 0;
            for (int i = 0; i < phoneList.Count; i++)
            {
                if(phoneList[i].Name == name)
                {
                    phoneList.Remove(phoneList[i]);
                    count++;
                   break;
                }
                
                
            }
            if(count == 0)
            {
                Console.WriteLine("Can not find the name");
            }
            
            
        }

        public override void searchPhone(string name)
        {
            int count = 0;
            for (int i = 0; i < phoneList.Count; i++)
            {
                if (phoneList[i].Name == name)
                {
                    Console.WriteLine("Phone number: ");
                    Console.WriteLine(phoneList[i].Phone);
                    count++;
                }
            }
            if(count == 0)
            {
                Console.WriteLine("Can not find the name");
            }
            
        }

        public override void updatePhone(string name, string newphone)
        {
            int count = 0;
            for (int i = 0; i < phoneList.Count; i++)
            {
                if (phoneList[i].Name == name)
                {
                    phoneList[i].Phone = newphone;
                    count++;
                    break;
                }
            }
            if(count ==0)
            {
                Console.WriteLine("Can not find the name");
            }
           
        }
    }
}
