.class public final La1/n$a;
.super La1/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La1/n;->B()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La1/i;


# direct methods
.method public constructor <init>(La1/i;)V
    .locals 0

    iput-object p1, p0, La1/n$a;->a:La1/i;

    invoke-direct {p0}, La1/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(La1/i;)V
    .locals 1

    iget-object v0, p0, La1/n$a;->a:La1/i;

    invoke-virtual {v0}, La1/i;->B()V

    invoke-virtual {p1, p0}, La1/i;->y(La1/i$d;)V

    return-void
.end method
