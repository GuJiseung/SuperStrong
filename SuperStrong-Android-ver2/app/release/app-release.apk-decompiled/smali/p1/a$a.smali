.class public final Lp1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo1/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo1/o<",
        "Lo1/f;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lo1/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo1/m<",
            "Lo1/f;",
            "Lo1/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo1/m;

    invoke-direct {v0}, Lo1/m;-><init>()V

    iput-object v0, p0, Lp1/a$a;->a:Lo1/m;

    return-void
.end method


# virtual methods
.method public final a(Lo1/r;)Lo1/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo1/r;",
            ")",
            "Lo1/n<",
            "Lo1/f;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance p1, Lp1/a;

    iget-object v0, p0, Lp1/a$a;->a:Lo1/m;

    invoke-direct {p1, v0}, Lp1/a;-><init>(Lo1/m;)V

    return-object p1
.end method
