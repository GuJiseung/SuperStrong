.class public final Lg5/s$b;
.super Lg4/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg5/s;->a(Ljava/lang/Exception;Le4/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lg4/e;
    c = "retrofit2.KotlinExtensions"
    f = "KotlinExtensions.kt"
    l = {
        0x71
    }
    m = "suspendAndThrow"
.end annotation


# instance fields
.field public synthetic e:Ljava/lang/Object;

.field public f:I


# direct methods
.method public constructor <init>(Le4/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lg4/c;-><init>(Le4/d;)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lg5/s$b;->e:Ljava/lang/Object;

    iget p1, p0, Lg5/s$b;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lg5/s$b;->f:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lg5/s;->a(Ljava/lang/Exception;Le4/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
