import java.util.Objects;

public class Element {

    private Element prev;
    private Element next;

    public String getValue() {
        return value;
    }

    String value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return value.equals(element.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public Element getPrev() {
        return prev;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Element(String value) {
        this.value = value;
    }
}
