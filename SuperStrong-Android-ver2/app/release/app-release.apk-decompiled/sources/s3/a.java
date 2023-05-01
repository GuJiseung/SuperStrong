package s3;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f5994a = new Type[0];

    /* renamed from: s3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0089a implements GenericArrayType, Serializable {

        /* renamed from: b  reason: collision with root package name */
        public final Type f5995b;

        public C0089a(Type type) {
            this.f5995b = a.a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && a.c(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f5995b;
        }

        public final int hashCode() {
            return this.f5995b.hashCode();
        }

        public final String toString() {
            return a.h(this.f5995b) + "[]";
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: b  reason: collision with root package name */
        public final Type f5996b;

        /* renamed from: c  reason: collision with root package name */
        public final Type f5997c;

        /* renamed from: d  reason: collision with root package name */
        public final Type[] f5998d;

        public b(Type type, Type type2, Type... typeArr) {
            Type a6;
            boolean z5;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z6 = true;
                if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (type == null && !z5) {
                    z6 = false;
                }
                c.a.g(z6);
            }
            if (type == null) {
                a6 = null;
            } else {
                a6 = a.a(type);
            }
            this.f5996b = a6;
            this.f5997c = a.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f5998d = typeArr2;
            int length = typeArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                this.f5998d[i6].getClass();
                a.b(this.f5998d[i6]);
                Type[] typeArr3 = this.f5998d;
                typeArr3[i6] = a.a(typeArr3[i6]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && a.c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f5998d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f5996b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f5997c;
        }

        public final int hashCode() {
            int i6;
            int hashCode = Arrays.hashCode(this.f5998d) ^ this.f5997c.hashCode();
            Type type = this.f5996b;
            if (type != null) {
                i6 = type.hashCode();
            } else {
                i6 = 0;
            }
            return hashCode ^ i6;
        }

        public final String toString() {
            Type[] typeArr = this.f5998d;
            int length = typeArr.length;
            Type type = this.f5997c;
            if (length == 0) {
                return a.h(type);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(a.h(type));
            sb.append("<");
            sb.append(a.h(typeArr[0]));
            for (int i6 = 1; i6 < length; i6++) {
                sb.append(", ");
                sb.append(a.h(typeArr[i6]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements WildcardType, Serializable {

        /* renamed from: b  reason: collision with root package name */
        public final Type f5999b;

        /* renamed from: c  reason: collision with root package name */
        public final Type f6000c;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z5;
            boolean z6;
            if (typeArr2.length <= 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            c.a.g(z5);
            if (typeArr.length == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            c.a.g(z6);
            if (typeArr2.length == 1) {
                typeArr2[0].getClass();
                a.b(typeArr2[0]);
                c.a.g(typeArr[0] == Object.class);
                this.f6000c = a.a(typeArr2[0]);
                this.f5999b = Object.class;
                return;
            }
            typeArr[0].getClass();
            a.b(typeArr[0]);
            this.f6000c = null;
            this.f5999b = a.a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && a.c(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f6000c;
            return type != null ? new Type[]{type} : a.f5994a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f5999b};
        }

        public final int hashCode() {
            Type type = this.f6000c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f5999b.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f6000c;
            if (type != null) {
                return "? super " + a.h(type);
            }
            Type type2 = this.f5999b;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + a.h(type2);
        }
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0089a(a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C0089a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    public static void b(Type type) {
        c.a.g(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static boolean c(Type type, Type type2) {
        boolean z5;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (ownerType != ownerType2 && (ownerType == null || !ownerType.equals(ownerType2))) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z5 && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    public static Type d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i6 = 0; i6 < length; i6++) {
                Class<?> cls3 = interfaces[i6];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i6];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return d(cls.getGenericInterfaces()[i6], interfaces[i6], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class<?> e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            c.a.g(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return e(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static Type f(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        c.a.g(cls2.isAssignableFrom(cls));
        return g(type, cls, d(type, cls, cls2), new HashSet());
    }

    public static Type g(Type type, Class cls, Type type2, HashSet hashSet) {
        Type[] typeArr;
        Type[] typeArr2;
        boolean z5;
        TypeVariable typeVariable;
        Class cls2;
        do {
            int i6 = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (hashSet.contains(typeVariable)) {
                    return type2;
                }
                hashSet.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type d6 = d(type, cls, cls2);
                    if (d6 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (i6 < length) {
                            if (typeVariable.equals(typeParameters[i6])) {
                                type2 = ((ParameterizedType) d6).getActualTypeArguments()[i6];
                                continue;
                            } else {
                                i6++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable;
                continue;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type g2 = g(type, cls, componentType, hashSet);
                        if (componentType != g2) {
                            return new C0089a(g2);
                        }
                        return cls3;
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type g6 = g(type, cls, genericComponentType, hashSet);
                    if (genericComponentType != g6) {
                        return new C0089a(g6);
                    }
                    return genericArrayType;
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type g7 = g(type, cls, ownerType, hashSet);
                    if (g7 != ownerType) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i6 < length2) {
                        Type g8 = g(type, cls, actualTypeArguments[i6], hashSet);
                        if (g8 != actualTypeArguments[i6]) {
                            if (!z5) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z5 = true;
                            }
                            actualTypeArguments[i6] = g8;
                        }
                        i6++;
                    }
                    if (z5) {
                        return new b(g7, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType;
                } else {
                    boolean z6 = type2 instanceof WildcardType;
                    WildcardType wildcardType = type2;
                    if (z6) {
                        WildcardType wildcardType2 = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type g9 = g(type, cls, lowerBounds[0], hashSet);
                            wildcardType = wildcardType2;
                            if (g9 != lowerBounds[0]) {
                                if (g9 instanceof WildcardType) {
                                    typeArr2 = ((WildcardType) g9).getLowerBounds();
                                } else {
                                    typeArr2 = new Type[]{g9};
                                }
                                return new c(new Type[]{Object.class}, typeArr2);
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type g10 = g(type, cls, upperBounds[0], hashSet);
                                wildcardType = wildcardType2;
                                if (g10 != upperBounds[0]) {
                                    if (g10 instanceof WildcardType) {
                                        typeArr = ((WildcardType) g10).getUpperBounds();
                                    } else {
                                        typeArr = new Type[]{g10};
                                    }
                                    return new c(typeArr, f5994a);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }

    public static String h(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
