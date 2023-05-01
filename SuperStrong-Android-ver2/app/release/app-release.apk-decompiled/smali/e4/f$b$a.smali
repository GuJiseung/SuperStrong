.class public final Le4/f$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le4/f$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Le4/f$b;Le4/f$c;)Le4/f$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Le4/f$b;",
            ">(",
            "Le4/f$b;",
            "Le4/f$c<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Le4/f$b;->getKey()Le4/f$c;

    move-result-object v0

    invoke-static {v0, p1}, Ll4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static b(Le4/f$b;Le4/f$c;)Le4/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le4/f$b;",
            "Le4/f$c<",
            "*>;)",
            "Le4/f;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Le4/f$b;->getKey()Le4/f$c;

    move-result-object v0

    invoke-static {v0, p1}, Ll4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p0, Le4/g;->b:Le4/g;

    :cond_0
    return-object p0
.end method
