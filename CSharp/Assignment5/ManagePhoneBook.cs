using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment5
{
    class ManagePhoneBook
    {
        static void Main(string[] args)
        {
            int flag = 0;
            PhoneBook phoneBook = new PhoneBook();

            PhoneNumber phoneNumber1 = new PhoneNumber("Trung", "123456");
            PhoneNumber phoneNumber2 = new PhoneNumber("Truong", "223456");
            PhoneNumber phoneNumber3 = new PhoneNumber("Thanh", "323456");

            phoneBook.AddPhoneList(phoneNumber1);
            phoneBook.AddPhoneList(phoneNumber2);
            phoneBook.AddPhoneList(phoneNumber3);

            do
            {
                Console.WriteLine("PHONEBOOK MANAGEMENT SYSTEM");
                Console.WriteLine("1. Insert phone");
                Console.WriteLine("2. Remove phone");
                Console.WriteLine("3. Update phone");
                Console.WriteLine("4. Search phone");
                Console.WriteLine("5. Exit");
                Console.WriteLine("6. Show all");
                Console.WriteLine("Please choose an option");
                int choice = Convert.ToInt32(Console.ReadLine());
                if(choice <7 && choice>0)
                {
                    switch (choice)
                    {
                        case 1:
                            Console.WriteLine("Name: ");
                            String name = Console.ReadLine();
                            Console.WriteLine("Phone: ");
                            String phone = Console.ReadLine();
                            phoneBook.insertPhone(name, phone);
                            break;
                        case 2:
                            Console.WriteLine("Name: ");
                            String name1 = Console.ReadLine();
                            phoneBook.removePhone(name1);
                            break;
                        case 3:
                            Console.WriteLine("Name: ");
                            String name3 = Console.ReadLine();
                            Console.WriteLine("Phone: ");
                            String phone3 = Console.ReadLine();
                            phoneBook.updatePhone(name3, phone3);
                            break;
                        case 4:
                            Console.WriteLine("Name: ");
                            String name4 = Console.ReadLine();
                            phoneBook.searchPhone(name4);
                            break;
                        case 5:
                            flag = 1;
                            break;
                        case 6:
                            for (int i = 0; i < phoneBook.PhoneList.Count; i++)
                            {
                                Console.WriteLine();
                                Console.Write("Name: ");
                                Console.Write(phoneBook.PhoneList[i].Name);
                                Console.Write("\t\t");
                                Console.Write("Phone: ");
                                Console.Write(phoneBook.PhoneList[i].Phone);
                                
                            }
                            Console.WriteLine();
                            break;

                    }
                }
                else
                {
                    Console.WriteLine("Your choice is from 1 to 5");
                }
            } while (flag ==0);
            
            Console.ReadKey();
        }
    }
}
