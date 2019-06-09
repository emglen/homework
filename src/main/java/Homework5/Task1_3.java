package Homework5;

public class Task1_3 {

    public static class LinkClass{
        private String link;

        public LinkClass(String link){
            this.link=link;
        }

        public void getLink(){
            if(link==null){
                throw new NullPointerException("Object link is null");
            }
            else{
                System.out.println(link);
            }
        }
    }

    public static void main(String[] args) throws NullPointerException {
        LinkClass newLink=new LinkClass(null);

        try {
            newLink.getLink();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally text");
        }
    }
}
