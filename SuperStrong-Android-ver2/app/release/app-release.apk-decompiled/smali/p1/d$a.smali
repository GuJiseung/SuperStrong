.class public abstract Lp1/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo1/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo1/o<",
        "Landroid/net/Uri;",
        "TDataT;>;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TDataT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "TDataT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/d$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lp1/d$a;->b:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(Lo1/r;)Lo1/n;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo1/r;",
            ")",
            "Lo1/n<",
            "Landroid/net/Uri;",
            "TDataT;>;"
        }
    .end annotation

    new-instance v0, Lp1/d;

    const-class v1, Ljava/io/File;

    iget-object v2, p0, Lp1/d$a;->b:Ljava/lang/Class;

    invoke-virtual {p1, v1, v2}, Lo1/r;->b(Ljava/lang/Class;Ljava/lang/Class;)Lo1/n;

    move-result-object v1

    const-class v3, Landroid/net/Uri;

    invoke-virtual {p1, v3, v2}, Lo1/r;->b(Ljava/lang/Class;Ljava/lang/Class;)Lo1/n;

    move-result-object p1

    iget-object v3, p0, Lp1/d$a;->a:Landroid/content/Context;

    invoke-direct {v0, v3, v1, p1, v2}, Lp1/d;-><init>(Landroid/content/Context;Lo1/n;Lo1/n;Ljava/lang/Class;)V

    return-object v0
.end method
