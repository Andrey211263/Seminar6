import java.util.*;


public class NoutBook {

    @Override
    public String toString() {
        return "NoutBook{" +brands +
                ", CPU='" + CPU + '\'' +
                ", model='" + model + '\'' +
                ", Memory=" + Memory +
                ", Hdd=" + Hdd +
                ", system='" + system + '\'' +
                "}\n";
    }


    public List<Brand> brands;
    public String CPU;
    public String model;
    public int Memory;
    public int Hdd;
    public String system;
    public NoutBook(){

    }
    public NoutBook(String CPU, String model, int Memory, int Hdd, String system){
        this.brands = new ArrayList<>();
        this.CPU = CPU;
        this.model = model;
        this.Memory = Memory;
        this.Hdd = Hdd;
        this.system = system;

    }


    public void addBrand(Brand brand) {
        brands.add(brand);
    }
    public Set<NoutBook> FindBook(Set<NoutBook> books) {
        Scanner scan = new Scanner(System.in);

        Set<NoutBook> nout = new HashSet<>(books);
        boolean triger = true;
        String HddSize = null;
        String cpuSize = null;
        String systemSize = null;
        String memorySize = null;
        memorySize = "";
        HddSize = "";
        systemSize = "";
        cpuSize = "";
        while (triger) {
            System.out.println("Выберите параметры фильрации ноутбуков," +
                    "\n1. Объем ЖД\n2. ОЗУ\n3. Операционная система\n4. Тип процессора\n"
                    + "5. Просмотр всего списка техники\n Выход - 0");
            String user = scan.nextLine();



            switch (user) {  // Определение критериев поиска
                case "1": {
                    System.out.println("Укажите размер жёсткого диска в гб\nВналичии : 300,500,600,1000\n");
                    HddSize = scan.nextLine();
                    break;
                }
                case "2": {
                    System.out.println("Укажите количество оперативной памяти в Гб\nВналичии : 4, 8, 16 ");
                    memorySize = scan.nextLine();
                    break;
                }
                case "3": {
                    System.out.println("Укажите операционную систему\nВналичии : Linux, Windows");
                    systemSize = scan.nextLine();
                    break;
                }
                case "4": {
                    System.out.println("Выберите процессор\nВналичии: Intel; AMD ");
                    cpuSize = scan.nextLine();
                    break;
                }
                case "5": { // просмотр построчно
                    String line = "5";
                    for (NoutBook item : books) {
                        System.out.println(item + "\n");
                        if (line == "") line = "5";
                        int i = 0;
                        if (line.charAt(i) == '0') {
                            break;
                        } else {
                            System.out.println("Продолжить 'enter', иначе '0'");
                            line = scan.nextLine();
                        }
                    }
                    break;
                }
                default:
                    int i = 0;
                    if (user.charAt(i) == '0') {
                        triger = false;
                        break;
                    }
            }

        }
        scan.close();
        if (HddSize != "") {    //Убираем все кроме HddSize
            for (NoutBook item : books) {
                if (item.Hdd != Integer.parseInt(HddSize)) {
                    nout.remove(item);
                }
            }
        }
        if (cpuSize != "") {    //Фильтрация оставшегося списка по типу CPU
            for (NoutBook item : books) {
                if (!cpuSize.equals(item.CPU)) {
                    nout.remove(item);

                }
            }
        }
        if (systemSize != "") {  //по типу ОС
            for (NoutBook item : books) {
                if (!systemSize.equals(item.system)) {
                    nout.remove(item);

                }
            }
        }
        if (memorySize != "") {  //по размеру ОЗУ
            for (NoutBook item : books) {

                if (item.Memory != Integer.parseInt(memorySize)) {
                    nout.remove(item);

                }
            }
        }

        return nout;
    }
    }

