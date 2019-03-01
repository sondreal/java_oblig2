package no.uib.venneliste;

public class FriendsList<T> implements FriendsListInterface {

    private Node<Friend> head = null;
    private int size = 0;

    public FriendsList(Friend T){
        head = new Node(T);
    }

    public int indexOf(Friend item){
        int index = 0;
        Node<Friend> current = head;

        while (current != null ) {
            if (current.data.equals(item)){
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    @Override
    public boolean addFriend(int index, Friend item) {
        if(index < 0 || index > size){
            return false;
        }

        if( index == 0){
            head = new Node<Friend>(item, head);

            size++;
        }

        else {
            Node<Friend> node = getNode(index - 1);
            node.next = new Node<Friend>(item, node.next);
            size ++;

        }
        return true;
    }

    public Node<Friend> getNode(int index){
        Node<Friend> node = head;
        for (int i=0; i<index && node != null; i++){
            node = node.next;
        }
        return node;
    }

    public boolean removeFriend(Friend item) {
        boolean found = false;
        Node<Friend> current = head;
        Node<Friend> previous = head;
        while( current != null){
            if(current.data.equals(item)){
                found = true;
                size--;

                if(current == head){
                    head = current.next;
                }else
                    previous.next = current.next;

                break;
            }
            previous = current;
            current = current.next;
        }
        return found;
    }

    @Override
    public String sortedList() {
        return null;
    }
}
