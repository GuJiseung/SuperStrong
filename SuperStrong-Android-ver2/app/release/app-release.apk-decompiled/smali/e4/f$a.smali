.class public final Le4/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le4/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Le4/f;Le4/f;)Le4/f;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Le4/g;->b:Le4/g;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Le4/f$a$a;->c:Le4/f$a$a;

    invoke-interface {p1, p0, v0}, Le4/f;->fold(Ljava/lang/Object;Lk4/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le4/f;

    :goto_0
    return-object p0
.end method
