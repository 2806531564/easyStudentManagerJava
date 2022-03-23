package 学生管理系统_demo;

public class hero {
    private int m_age;
    private String m_name;
    private String m_skill;
    private double m_attack_distance;

     public hero(){

     }

     public hero(String name,int age,String skill,Double attack_distance){
         m_age=age;
         m_name=name;
         m_skill=skill;
         m_attack_distance=attack_distance;
     }

     public int get_age(){
         return m_age;
     }

     public String get_name(){
         return m_name;
     }

     public String get_skill(){
         return m_skill;
     }

     public double get_attack_distance(){
         return m_attack_distance;
     }

     public void set_age(int age){
         this.m_age=age;
     }

     public void set_name(String name){
         this.m_name=name;
     }

     public void set_skill(String skill){
         this.m_skill=skill;
     }

     public void set_attack_distance(double attack_distance){
         this.m_attack_distance=attack_distance;
     }

     public void show_hero(){
         System.out.println("英雄名称："+m_name+",英雄年龄:"+m_age+",英雄技能："+m_skill+"，英雄攻击距离:"+m_attack_distance+"千米");
     }


}
