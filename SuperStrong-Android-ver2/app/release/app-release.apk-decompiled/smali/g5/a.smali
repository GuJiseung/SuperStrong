.class public final Lg5/a;
.super Lg5/f$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg5/a$c;,
        Lg5/a$a;,
        Lg5/a$f;,
        Lg5/a$e;,
        Lg5/a$b;,
        Lg5/a$d;
    }
.end annotation


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lg5/f$a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg5/a;->a:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Type;)Lg5/f;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-class v0, Lv4/a0;

    invoke-static {p1}, Lg5/h0;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lg5/a$b;->b:Lg5/a$b;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lg5/d0;)Lg5/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lg5/d0;",
            ")",
            "Lg5/f<",
            "Lv4/d0;",
            "*>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-class p3, Lv4/d0;

    if-ne p1, p3, :cond_1

    const-class p1, Li5/w;

    invoke-static {p2, p1}, Lg5/h0;->h([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lg5/a$c;->b:Lg5/a$c;

    goto :goto_0

    :cond_0
    sget-object p1, Lg5/a$a;->b:Lg5/a$a;

    :goto_0
    return-object p1

    :cond_1
    const-class p2, Ljava/lang/Void;

    if-ne p1, p2, :cond_2

    sget-object p1, Lg5/a$f;->b:Lg5/a$f;

    return-object p1

    :cond_2
    iget-boolean p2, p0, Lg5/a;->a:Z

    if-eqz p2, :cond_3

    :try_start_0
    const-class p2, Lc4/h;

    if-ne p1, p2, :cond_3

    sget-object p1, Lg5/a$e;->b:Lg5/a$e;
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lg5/a;->a:Z

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method
