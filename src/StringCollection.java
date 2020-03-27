public class StringCollection {

    Element collectionHead;

    private int size() {

        int result = 0;
        Element elements = collectionHead;

        while (elements != null) {
            elements = elements.getNext();

            result++;
        }
        return result;
    }

    void AddElement(String a) {

        Element elementNew = new Element(a);
        Element temporaryHead;

        if (collectionHead == null) {
            collectionHead = elementNew;
        } else {

            temporaryHead = collectionHead;
            collectionHead = elementNew;

            temporaryHead.setPrev(collectionHead);
            collectionHead.setNext(temporaryHead);

        }
    }

    String getElement(int n) {

        String result = null;
        Element elementCollecion = collectionHead;
        int size = size();

        if (n > size) {
            throw new IndexOutOfBoundsException("OUT_OF_RANGE");
        } else {
            for (int i = 0; i < size; i++) {
                if (n == i) {
                    result = elementCollecion.getValue();
                    break;
                } else {
                    elementCollecion = elementCollecion.getNext();
                }
            }
        }
        return result;
    }

    Integer getElement(String input) {

        Element element = collectionHead;

        for (int i = 0; i < size(); i++) {
            if (element.getValue().equals(input)) {
                return i;
            } else {
                element = element.getNext();
            }
        }
        return null;
    }

    Boolean removeElement(String a) {

        int elementToremoveIndex = getElement(a);
        Element first;
        Element last;

        if (size() == elementToremoveIndex) {

            collectionHead = collectionHead.getNext();
            collectionHead.setPrev(null);
            return true;

        }
    return false;
    }
}






