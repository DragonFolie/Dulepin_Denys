# Dulepin_Denys
Hw
Spring_1 Intro & Core 

 

Підготувати POJO класи з анотацією @Component, які розміщені в пекеджі com.epam.spring.homework1.beans (біни: BeanA, BeanB, BeanC) 

Кожен бін повинен мати конструктор без аргументів в якому буде виводитись на екран назва класу, напр: 

 

Підготувати POJO класи з анотацією @Component, які розміщенні в пекеджі: 

com.epam.spring.homework1.other (біни: OtherBeanA, OtherBeanB, OtherBeanC) 

 

2.1. Кожен Other... бін повинен inject-ати біни з пекеджа beans за допомогою @Autowired в: 

Конструктор (OtherBeanA -> BeanA) 

В коснтрукторі вивести на екран назву класу + назву залежності яка була injected, напр 

 

Сеттер (OtherBeanB -> BeanB) 

В сеттері вивести на екран назву класу + назву залежності яка була injected 

Поле (OtherBeanC -> BeanC) 

OtherBeanC повинен мати конструктор без аргументів в якому буде виведено на екран: 

 - поміркуйте, чому значення цього об’єкту буде null. 

 

Створити 2ва файли конфігурації @Configuration в пекеджі  

com.epam.spring.homework1.config  

Перший BeansConfig проводить скан компонентів в пекіджі beans і також імпортує OtherConfig. 

Другий OtherConfig сканує усі компоненти з пекеджа other. 

Створити декілька бінів (Dog, Cat, Cheetah, Spider) в пекеджі pet, які реалізовують Animal інтерфейс. Створити бін Pet,  що буде inject-ати колекцію для створених тварин, які є впорядковані з використанням @Order (Dog – повинен виводитись завжди першим).  

Сторити конфігурацію PetConfig для бінів з п.6 (сканує усі біни окрім Spider). Iмпортнути конфігурацію PetConfig  у OtherConfig.  

 У конфігураційному класі PetConfig створить ще 2 біни Cheetah (@Bean), один з них повинен буде маркований як @Primary, а інший за допомогою @Qualifier 

Створіть ApplicationContext на основі BeansConfig конфігурації та дістаньте з контексту бін  Pet на якому викличте метод printPets().  

*** Поексперментуйте з PetConfig, а саме з @Primary і @Qualifier анотаціями. Дістаньте з контексу бін Cheetah за типом, за іменем біна і проаналізуйте результат 

 

Вихідний результат п.9: 

Text
