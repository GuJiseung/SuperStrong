package p0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f5697a;

    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f5698a;

        /* renamed from: b  reason: collision with root package name */
        public final d f5699b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5700c = true;

        public a(TextView textView) {
            this.f5698a = textView;
            this.f5699b = new d(textView);
        }

        @Override // p0.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f5700c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i6 = 0; i6 < inputFilterArr.length; i6++) {
                    InputFilter inputFilter = inputFilterArr[i6];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i6, inputFilter);
                    }
                }
                if (sparseArray.size() != 0) {
                    int length = inputFilterArr.length;
                    InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                    int i7 = 0;
                    for (int i8 = 0; i8 < length; i8++) {
                        if (sparseArray.indexOfKey(i8) < 0) {
                            inputFilterArr2[i7] = inputFilterArr[i8];
                            i7++;
                        }
                    }
                    return inputFilterArr2;
                }
                return inputFilterArr;
            }
            int length2 = inputFilterArr.length;
            int i9 = 0;
            while (true) {
                d dVar = this.f5699b;
                if (i9 < length2) {
                    if (inputFilterArr[i9] != dVar) {
                        i9++;
                    } else {
                        return inputFilterArr;
                    }
                } else {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = dVar;
                    return inputFilterArr3;
                }
            }
        }

        @Override // p0.f.b
        public final void b(boolean z5) {
            if (z5) {
                d();
            }
        }

        @Override // p0.f.b
        public final void c(boolean z5) {
            this.f5700c = z5;
            d();
            TextView textView = this.f5698a;
            textView.setFilters(a(textView.getFilters()));
        }

        public final void d() {
            TextView textView = this.f5698a;
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (this.f5700c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    transformationMethod = new h(transformationMethod);
                }
            } else if (transformationMethod instanceof h) {
                transformationMethod = ((h) transformationMethod).f5707b;
            }
            textView.setTransformationMethod(transformationMethod);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public void b(boolean z5) {
            throw null;
        }

        public void c(boolean z5) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f5701a;

        public c(TextView textView) {
            this.f5701a = new a(textView);
        }

        @Override // p0.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            boolean z5;
            if (androidx.emoji2.text.f.f1317j != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                return inputFilterArr;
            }
            return this.f5701a.a(inputFilterArr);
        }

        @Override // p0.f.b
        public final void b(boolean z5) {
            boolean z6;
            if (androidx.emoji2.text.f.f1317j != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                return;
            }
            this.f5701a.b(z5);
        }

        @Override // p0.f.b
        public final void c(boolean z5) {
            boolean z6;
            if (androidx.emoji2.text.f.f1317j != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z7 = !z6;
            a aVar = this.f5701a;
            if (z7) {
                aVar.f5700c = z5;
            } else {
                aVar.c(z5);
            }
        }
    }

    public f(TextView textView) {
        if (textView != null) {
            this.f5697a = new c(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }
}
