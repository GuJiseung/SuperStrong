.class public final Lo1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo1/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo1/u$a;,
        Lo1/u$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo1/n<",
        "TModel;TModel;>;"
    }
.end annotation


# static fields
.field public static final a:Lo1/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo1/u<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo1/u;

    invoke-direct {v0}, Lo1/u;-><init>()V

    sput-object v0, Lo1/u;->a:Lo1/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILi1/h;)Lo1/n$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;II",
            "Li1/h;",
            ")",
            "Lo1/n$a<",
            "TModel;>;"
        }
    .end annotation

    new-instance p2, Lo1/n$a;

    new-instance p3, Ld2/d;

    invoke-direct {p3, p1}, Ld2/d;-><init>(Ljava/lang/Object;)V

    new-instance p4, Lo1/u$b;

    invoke-direct {p4, p1}, Lo1/u$b;-><init>(Ljava/lang/Object;)V

    invoke-direct {p2, p3, p4}, Lo1/n$a;-><init>(Li1/f;Lcom/bumptech/glide/load/data/d;)V

    return-object p2
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;)Z"
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method
