public class MultilineString {
    DDDString[] strings;
    MultilineString(String content){
        String[] contents = content.split(" ");
        strings = new DDDString[contents.length];
        for(int i = 0; i < contents.length; i++){
            strings[i] = new DDDString(contents[i]);
        }
    }
    public void print(){
        for(int i = 0; i < strings.length; i++){
            strings[i].print();
        }
    }
}
