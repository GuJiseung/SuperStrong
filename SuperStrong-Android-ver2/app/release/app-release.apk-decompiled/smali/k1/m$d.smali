.class public final Lk1/m$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final a:Lk1/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk1/n<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:La2/h;

.field public final synthetic c:Lk1/m;


# direct methods
.method public constructor <init>(Lk1/m;La2/h;Lk1/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/h;",
            "Lk1/n<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lk1/m$d;->c:Lk1/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lk1/m$d;->b:La2/h;

    iput-object p3, p0, Lk1/m$d;->a:Lk1/n;

    return-void
.end method
