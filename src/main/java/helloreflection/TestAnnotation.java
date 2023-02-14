package helloreflection;

@HelloAnnotation("test-anno")
public class TestAnnotation {

    @HelloAnnotation("test-foo")
    public void foo() {
    }

}
