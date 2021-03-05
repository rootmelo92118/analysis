package android.support.constraint.solver.widgets;

public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f544x;

    /* renamed from: y */
    public int f545y;

    public void setBounds(int i, int i2, int i3, int i4) {
        this.f544x = i;
        this.f545y = i2;
        this.width = i3;
        this.height = i4;
    }

    /* access modifiers changed from: package-private */
    public void grow(int i, int i2) {
        this.f544x -= i;
        this.f545y -= i2;
        this.width += i * 2;
        this.height += i2 * 2;
    }

    /* access modifiers changed from: package-private */
    public boolean intersects(Rectangle rectangle) {
        return this.f544x >= rectangle.f544x && this.f544x < rectangle.f544x + rectangle.width && this.f545y >= rectangle.f545y && this.f545y < rectangle.f545y + rectangle.height;
    }

    public boolean contains(int i, int i2) {
        return i >= this.f544x && i < this.f544x + this.width && i2 >= this.f545y && i2 < this.f545y + this.height;
    }

    public int getCenterX() {
        return (this.f544x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f545y + this.height) / 2;
    }
}
