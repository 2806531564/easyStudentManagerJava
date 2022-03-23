package 学生管理系统_demo;
import java.util.Scanner;
import java.util.ArrayList;
public class hero_manager {
    public static void main(String[]args){
        ArrayList<hero> arr=new ArrayList<hero>();
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            show_menu();
            choice=sc.nextInt();
            switch (choice){
                case 1:add_hero(arr);break;
                case 2:delete_hero(arr);break;
                case 3:modify_hero(arr);break;
                case 4:look_all_hero(arr);break;
                case 5:exit();break;
                default:
                    System.out.println("输入错误!!!");break;
            }
        }while(true);
    }

    public static void show_menu(){
        System.out.println("----------------欢迎来到王者荣耀----------------");
        System.out.println("....1.添加英雄");
        System.out.println("....2.删除英雄");
        System.out.println("....3.修改英雄");
        System.out.println("....4.查看所有英雄");
        System.out.println("....5.退出");
        System.out.println("-------------------牛逼plus-------------------");
        System.out.println("请输入您的选择:");
    }

    public static void add_hero(ArrayList<hero> arr){
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("您要添加几个英雄?请输入数字:");
            int add_num = sc.nextInt();
            String space=sc.nextLine();
            for (int i = 0; i < add_num; i++) {
                System.out.println("请分别输入第" + (i + 1) + "个英雄的姓名,年龄，技能，攻击距离:");
                String hero_name = sc.nextLine();
                int hero_age = sc.nextInt();
                space=sc.nextLine();
                String hero_skill = sc.nextLine();
                double hero_attack_distance = sc.nextDouble();
                space=sc.nextLine();
                hero new_hero = new hero(hero_name, hero_age, hero_skill, hero_attack_distance);
                arr.add(new_hero);
                System.out.println("添加成功！！！");
            }
            System.out.println("1.继续添加");
            System.out.println("2.退回主菜单");
            choice = sc.nextInt();
            if(choice!=1&&choice!=2){
                System.out.println("输入错误,自动回到主菜单!");
            }
            }
        while(choice==1);
    }

    public static void delete_hero(ArrayList<hero> arr){
        if(arr.size()==0){
            System.out.println("暂时没有英雄!!!");
            return;
        }
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您想要删除的英雄的名称:");
            String name = sc.nextLine();
            for (int i = 0; i < arr.size(); i++) {
                String goal_name = arr.get(i).get_name();
                if (name.equals(goal_name)) {
                    arr.remove(i);
                    System.out.println("删除成功！");
                    break;
                }
                if(i==arr.size()-1){
                    System.out.println("未找到该英雄！！！");
                }
            }
            System.out.println("1.继续删除");
            System.out.println("2.退回主菜单");
            choice=sc.nextInt();
            if(choice!=1&&choice!=2){
                System.out.println("输入错误,自动返回主菜单");
            }
        }while(choice==1);
    }

    public static void modify_hero(ArrayList<hero> arr){
        if(arr.size()==0){
            System.out.println("暂时没有英雄!!!");
            return;
        }
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您想要修改的英雄的名称:");
            String name = sc.nextLine();
            for (int i = 0; i < arr.size(); i++) {
                String goal_name = arr.get(i).get_name();
                if (name.equals(goal_name)) {
                    System.out.println("该英雄信息为：");
                    arr.get(i).show_hero();
                    System.out.println("请输入要修改的信息");
                    System.out.println("1.姓名");
                    System.out.println("2.年龄");
                    System.out.println("3.技能");
                    System.out.println("4.攻击距离");
                    System.out.println("5.全部修改");
                    int index=sc.nextInt();
                    String space=sc.nextLine();
                    switch (index){
                        case 1:
                            System.out.println("请输入修改后的姓名");String new_name=sc.nextLine();arr.get(i).set_name(new_name);break;
                        case 2:
                            System.out.println("请输入修改后的年龄");int new_age=sc.nextInt();arr.get(i).set_age(new_age);break;
                        case 3:
                            System.out.println("请输入修改后的技能");String new_skill=sc.nextLine();arr.get(i).set_skill(new_skill);break;
                        case 4:
                            System.out.println("请输入修改后的攻击距离");double new_attack_distance=sc.nextDouble();arr.get(i).set_attack_distance(new_attack_distance);break;
                        case 5:
                            System.out.println("请分别输入英雄的姓名,年龄，技能，攻击距离:");
                            String hero_name = sc.nextLine();
                            int hero_age = sc.nextInt();
                            space=sc.nextLine();
                            String hero_skill = sc.nextLine();
                            double hero_attack_distance = sc.nextDouble();
                            space=sc.nextLine();
                            arr.get(i).set_name(hero_name);
                            arr.get(i).set_age(hero_age);
                            arr.get(i).set_skill(hero_skill);
                            arr.get(i).set_attack_distance(hero_attack_distance);
                            break;
                        default:
                            System.out.println("输入错误！！！请重新输入！！！");
                    }
                    if(index>=1&&index<=5) {
                        System.out.println("修改成功");break;
                    }else{
                        i--;
                    }
                }
                if(i==arr.size()-1){
                    System.out.println("未找到该英雄!");
                }
            }
            System.out.println("1.继续修改");
            System.out.println("2.退回主菜单");
            choice=sc.nextInt();
            if(choice!=1&&choice!=2){
                System.out.println("输入错误,自动返回主菜单");
            }
        }while(choice==1);
    }

    public static void look_all_hero(ArrayList<hero> arr){
        if(arr.size()==0){
            System.out.println("暂时没有英雄!!!");
            return;
        }
        for(int i=0;i<arr.size();i++){
            arr.get(i).show_hero();
        }
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("按任意键继续");
        str=sc.nextLine();
        return;
    }

    public static void exit(){
        System.out.println("确定退出程序?");
        System.out.println("1.确定");
        System.out.println("2.返回");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice){
            case 1:System.exit(0);
            case 2:return ;
        }

    }

}
