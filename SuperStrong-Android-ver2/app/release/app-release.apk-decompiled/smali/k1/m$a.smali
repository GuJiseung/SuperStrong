.class public final Lk1/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lk1/j$d;

.field public final b:Lf2/a$c;

.field public c:I


# direct methods
.method public constructor <init>(Lk1/m$c;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk1/m$a$a;

    invoke-direct {v0, p0}, Lk1/m$a$a;-><init>(Lk1/m$a;)V

    const/16 v1, 0x96

    invoke-static {v1, v0}, Lf2/a;->a(ILf2/a$b;)Lf2/a$c;

    move-result-object v0

    iput-object v0, p0, Lk1/m$a;->b:Lf2/a$c;

    iput-object p1, p0, Lk1/m$a;->a:Lk1/j$d;

    return-void
.end method
