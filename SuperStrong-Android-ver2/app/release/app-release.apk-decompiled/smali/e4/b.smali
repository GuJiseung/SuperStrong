.class public abstract Le4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le4/f$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B::",
        "Le4/f$b;",
        "E::TB;>",
        "Ljava/lang/Object;",
        "Le4/f$c<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final b:Lk4/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk4/l<",
            "Le4/f$b;",
            "TE;>;"
        }
    .end annotation
.end field

.field public final c:Le4/f$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le4/f$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le4/f$c;Lk4/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le4/f$c<",
            "TB;>;",
            "Lk4/l<",
            "-",
            "Le4/f$b;",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "baseKey"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Le4/b;->b:Lk4/l;

    instance-of p2, p1, Le4/b;

    if-eqz p2, :cond_0

    check-cast p1, Le4/b;

    iget-object p1, p1, Le4/b;->c:Le4/f$c;

    :cond_0
    iput-object p1, p0, Le4/b;->c:Le4/f$c;

    return-void
.end method


# virtual methods
.method public final a(Le4/f$b;)Le4/f$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le4/f$b;",
            ")TE;"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le4/b;->b:Lk4/l;

    invoke-interface {v0, p1}, Lk4/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le4/f$b;

    return-object p1
.end method
