.class public final Ls4/t$a;
.super Le4/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls4/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le4/b<",
        "Le4/e;",
        "Ls4/t;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Le4/e$a;->b:Le4/e$a;

    sget-object v1, Ls4/t$a$a;->c:Ls4/t$a$a;

    invoke-direct {p0, v0, v1}, Le4/b;-><init>(Le4/f$c;Lk4/l;)V

    return-void
.end method
