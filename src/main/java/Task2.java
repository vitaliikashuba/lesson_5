public class Task2 {
    public enum UserStatus{
        PENDING,
        ACTIVE,
        INACTIVE,
        DELETED;
    }
    public static class StatusPrint{
        public static void main(String[] args) {
            //ACTIVE
            System.out.println(UserStatus.ACTIVE);

            /*
            //PENDING
            System.out.println(UserStatus.PENDING);
            //INACTIVE
            System.out.println(UserStatus.INACTIVE);
            //DELETED
            System.out.println(UserStatus.DELETED);
             */
        }
    }
}
