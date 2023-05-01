.class public final La1/i$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La1/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Ljava/lang/String;

.field public final c:La1/q;

.field public final d:La1/j0;

.field public final e:La1/i;


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/String;La1/i;La1/i0;La1/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/i$b;->a:Landroid/view/View;

    iput-object p2, p0, La1/i$b;->b:Ljava/lang/String;

    iput-object p5, p0, La1/i$b;->c:La1/q;

    iput-object p4, p0, La1/i$b;->d:La1/j0;

    iput-object p3, p0, La1/i$b;->e:La1/i;

    return-void
.end method
