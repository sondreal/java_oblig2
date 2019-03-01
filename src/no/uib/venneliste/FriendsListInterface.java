package no.uib.venneliste;

public interface FriendsListInterface {
    /**
     * addFriend()
     * @return if true return the added friend as a String, else return error.
     */
    boolean addFriend(int index, Friend item);

    /**
     * removeFriend()
     * @return if true return the removed friend as a String, else return error.
     */
    boolean removeFriend(Friend item);
    /**
     * sortList()
     * @return the sorted list
     */
    String sortedList();
    /**
     * iterateList()
     *
     */

}
