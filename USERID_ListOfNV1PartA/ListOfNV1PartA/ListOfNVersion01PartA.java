/**
 * This class maintains an arbitrary length list of integers.
 * 
 * In this version 1:
 * 1. The size of the list is fixed after the object is created.
 * 2. The code assumes there is at least one element in the list.
 * 
 * This class introduces the use of loops.
 * 
 * @author Raymond Lister 
 * @version September 2014
 * 
 */
public class ListOfNVersion01PartA
{   
    private int[] list;  // Note: no "= {0, 1, 2, 3}" now

    /**
     * This constructor initializes the list to the same values
     * as in the parameter.
     *
     * @param  element   the initial elements for the list
     */
    public ListOfNVersion01PartA(int [] element)
    {
        list = new int[element.length];
        for(int i = 0; i < element.length; i++){
            list[i] = element[i];
        }

    } // constructor ListOfNVersion01Skeleton(int [] element)

    /**
     * @return     the number of elements stored in this list 
     */
    public int getListSize()
    {
        return list.length; 
    } // method getListSize

    /**
     * @return     the last element in the list
     */
    public int getLast()
    {
        return list[list.length-1]; 

    } // method getLast

    /**
     * prints the contents of the list, in order from first to last
     */
    public void printList()
    {
        
        System.out.print("{"  + list[0]);
        for(int i = 1; i < list.length; i++){
            System.out.print(", "  + list[i]);
        }
        System.out.print("}");

    } // method printList

    /**
     * This method is NOT examinable in this test.
     * 
     * prints the contents of the list, in order from first to last, and
     * then moves the cursor to the next line
     */
    public void printlnList()
    {
        printList();
        System.out.println();

    } // method printlnList

    /**
     * @return     the number of times the element occurs in the list
     * 
     * @param  element   the element to be counted
     */
    public int countElement(int element)
    {
        int count = 0; // role: stepper

        for(int i = 0; i < list.length; i++){
            if(list[i] == element){
                count++;
            }
        }

        return count;

    } // method countElement 

    /**
     * @return     the number of times the replacement was made
     * 
     * @param  replaceThis   the element to be replaced
     * @param  withThis      the replacement
     */
    public int replaceAll(int replaceThis, int withThis)
    {
        int count = 0; // role: stepper

        for(int i = 0; i < list.length; i++){
            if(list[i] == replaceThis){
                list[i] = withThis;
                count++;
            }
        }

        return count;

    } // method replaceAll

    /**
     * @return     the first position in list occupied by the parameter value, or -1 if it is not found
     * 
     * @param  findThis   the value to be found
     */
    public int findUnSorted(int findThis)
    {  
        for(int i = 0; i < list.length; i++){
            if(list[i] == findThis){
                return i;
            }
        }
        return -1;

    } // method findUnSorted 

    /**
     * @return     the position of the smallest element in the array, between positions "first" and "last"
     */
    public int minPos()
    {
        int mostWantedHolder = 0;  // role: Most-wanted holder

        for(int i = 0; i < list.length; i++){
            if(list[i] < list[mostWantedHolder]){
                mostWantedHolder = i;
            }
        }
        
        return mostWantedHolder;

    } // method minPos
    
    /**
     * Inserts an element in the last position. The elements already in the
     * list are pushed down one place, and the element that was previously
     * first is lost from the list.
     * 
     * @param  newElement   the element to be inserted
     */
    public void insertLast(int newElement)
    {   
        for(int i = 0; i < list.length-1; i++){
            list[i] = list[i+1];
        }
        list[list.length-1] = newElement;

    } // method insertLast
    
    /* 
     * ... several methods NOT examinable in this test have been deleted 
     */

} // class ListOfNVersion01PartA
