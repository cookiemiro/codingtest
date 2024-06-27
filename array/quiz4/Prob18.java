package array.quiz4;

public class Prob18 {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
}


class ShopService {
    private static ShopService service;

    private ShopService() {
        
    }

    public static ShopService getInstance() {
        System.out.println(service);
        if (service == null) {
            service = new ShopService();
        }

        return service;
    }
}