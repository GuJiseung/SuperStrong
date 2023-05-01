.class public final Le4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le4/f;
.implements Ljava/io/Serializable;


# static fields
.field public static final b:Le4/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le4/g;

    invoke-direct {v0}, Le4/g;-><init>()V

    sput-object v0, Le4/g;->b:Le4/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;Lk4/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lk4/p<",
            "-TR;-",
            "Le4/f$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    return-object p1
.end method

.method public final get(Le4/f$c;)Le4/f$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Le4/f$b;",
            ">(",
            "Le4/f$c<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final minusKey(Le4/f$c;)Le4/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le4/f$c<",
            "*>;)",
            "Le4/f;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final plus(Le4/f;)Le4/f;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptyCoroutineContext"

    return-object v0
.end method
