.class public final Lo1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo1/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo1/d$c;,
        Lo1/d$b;,
        Lo1/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        "Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo1/n<",
        "TModel;TData;>;"
    }
.end annotation


# instance fields
.field public final a:Lo1/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo1/d$a<",
            "TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo1/d$c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/d;->a:Lo1/d$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILi1/h;)Lo1/n$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;II",
            "Li1/h;",
            ")",
            "Lo1/n$a<",
            "TData;>;"
        }
    .end annotation

    new-instance p2, Lo1/n$a;

    new-instance p3, Ld2/d;

    invoke-direct {p3, p1}, Ld2/d;-><init>(Ljava/lang/Object;)V

    new-instance p4, Lo1/d$b;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lo1/d;->a:Lo1/d$a;

    invoke-direct {p4, p1, v0}, Lo1/d$b;-><init>(Ljava/lang/String;Lo1/d$a;)V

    invoke-direct {p2, p3, p4}, Lo1/n$a;-><init>(Li1/f;Lcom/bumptech/glide/load/data/d;)V

    return-object p2
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "data:image"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
